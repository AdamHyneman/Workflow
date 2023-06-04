package elephantProj.unit.middleware;

import elephantProj.middleware.CSRFFilter;
import elephantProj.middleware.CSRFTokenService;
import io.javalin.http.Context;
import io.javalin.http.util.ContextUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CSRFFilterTest {

    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;

    @Test
    @DisplayName("Should generate the token")
    void testGenerate() {
        String mockCSRFToken = "mockCSRFToken";
        Context context = spy(ContextUtil.init(request, response));
        when(request.getMethod()).thenReturn("GET");

        doReturn(null).when(context).sessionAttribute("SessionID");
        doNothing().when(context).sessionAttribute(anyString(), anyString());

        try (MockedStatic<CSRFTokenService> mockedService = mockStatic(CSRFTokenService.class)) {
            mockedService.when(() -> CSRFTokenService.generateToken(anyString())).thenReturn(mockCSRFToken);

            CSRFFilter.generate(context);

            verify(context).sessionAttribute(eq("csrf"), eq(mockCSRFToken));
        }
    }
}