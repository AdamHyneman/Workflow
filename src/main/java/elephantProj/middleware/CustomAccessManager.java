package elephantProj.middleware;

import elephantProj.controller.AbstractController;
import elephantProj.controller.HomeController;
import elephantProj.controller.LoginController;
import elephantProj.helper.UserRole;
import elephantProj.model.User;
import io.javalin.core.security.AccessManager;
import io.javalin.core.util.JavalinLogger;

/**
 * Access manager class
 */
public class CustomAccessManager {
    /**
     * Access manager to block unauthorized api calls
     */
    public static final AccessManager accessManager = (handler, ctx, permittedRoles) -> {
        if (permittedRoles.size() == 0) {
            //No roles->no permission check
            handler.handle(ctx);
            return;
        }
        User user = AbstractController.currentUser(ctx);
        UserRole userRole = getUserRole(user);
        if (permittedRoles.contains(userRole)) {
            handler.handle(ctx);
            return;
        }
        JavalinLogger.info(String.format("Permission deny to %s for %s", ctx.contextPath(), (user == null) ? "NoUser" : user.toString()));
        ctx.redirect(userRole == UserRole.ANYONE ? LoginController.BASIC_PAGE : HomeController.BASIC_PAGE, 302);
    };

    private static UserRole getUserRole(User currentUser) {
        UserRole role = (currentUser == null) ? UserRole.ANYONE : currentUser.role();
        JavalinLogger.info(String.format("User role %s", role.toString()));

        return role;
    }

}
