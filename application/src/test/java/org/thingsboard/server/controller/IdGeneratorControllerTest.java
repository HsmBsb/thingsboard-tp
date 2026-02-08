package org.thingsboard.server.controller;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;

public class IdGeneratorControllerTest {

    private final IdGeneratorController controller = new IdGeneratorController();

    @Test
    public void testUniqueIdGeneration() {
        String id1 = controller.generateUuid();
        String id2 = controller.generateUuid();

        assertNotNull("L'ID généré ne doit pas être null", id1);

        assertNotEquals("Deux appels successifs doivent générer des IDs différents", id1, id2);
    }
}