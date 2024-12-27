package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import modelToTesting.Eleve;

public class EleveTest {
    private Eleve eleve;

    @BeforeEach
    public void setUp() {
        eleve = new Eleve("Doe", "John", 20, 14);
    }

    @AfterEach
    public void tearDown() {
        eleve = null;
    }

    @Test
    public void testCreationEleve(){
        Assertions.assertEquals("Doe", eleve.getNom());
        Assertions.assertEquals("John", eleve.getPrenom());
        Assertions.assertEquals(20, eleve.getAge());
        Assertions.assertEquals(14, eleve.getMoyenne());
    }

    @Test
    public void testAccesseurs(){
        eleve.setNom("Smith");
        eleve.setPrenom("Jane");
        eleve.setAge(19);
        eleve.setMoyenne(11.0);

        Assertions.assertEquals("Smith", eleve.getNom());
        Assertions.assertEquals("Jane", eleve.getPrenom());
        Assertions.assertEquals(19, eleve.getAge());
        Assertions.assertEquals(11.0, eleve.getMoyenne());
    }

}
