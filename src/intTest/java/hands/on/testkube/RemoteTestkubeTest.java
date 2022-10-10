package hands.on.testkube;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RemoteTestkubeTest {

    @Test
    void testRemoteTestKube() {
        given().baseUri("http://keycloak.192.168.39.113.nip.io").port(443)
                .when().get("")
                        .then().statusCode(200);
    }
}
