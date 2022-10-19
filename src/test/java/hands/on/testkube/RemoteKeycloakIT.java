package hands.on.testkube;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RemoteKeycloakIT {

    @Test
    void testRemoteKeycloakOnTestKube() {
        given().baseUri("http://keycloak.192.168.39.19.nip.io")
                .when().get("")
                        .then().statusCode(200);
    }
}
