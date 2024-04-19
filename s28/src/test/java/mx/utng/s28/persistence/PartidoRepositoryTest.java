package mx.utng.s28.persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Equipo;
import mx.utng.s28.model.Partido;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.s28")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class PartidoRepositoryTest {
    @Autowired
    private PartidoRepository partidoRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    @BeforeAll
    void cleanDabatabase(){
        partidoRepository.deleteAll();
    }
    @Test
    @DisplayName("Prueba guardar partido")
    void canSave(){
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        equipo1.setNombre("Cruz Azul");
        equipo2.setNombre("Leon");

        equipoRepository.save(equipo1);
        equipoRepository.save(equipo2);

        Partido partido = new Partido();
        Partido.setEquipo1(equipo1);
        Partido.setEquipo2(equipo2);
    }
    
}
