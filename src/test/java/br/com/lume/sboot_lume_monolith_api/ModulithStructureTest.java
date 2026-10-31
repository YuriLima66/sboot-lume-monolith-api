package br.com.lume.sboot_lume_monolith_api;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

class ModulithStructureTest {

    @Test
    void verifyModulithStructure() {
        ApplicationModules modules = ApplicationModules.of(LumeApiApplication.class);
        modules.verify();
        new Documenter(modules).writeDocumentation();
    }
}