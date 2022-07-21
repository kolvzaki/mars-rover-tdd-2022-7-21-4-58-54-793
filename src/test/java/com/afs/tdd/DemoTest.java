package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

class DemoTest {
    @Test
    void given_0_0_n_m_when_execute_command_return_0_1_N() {
        List<String> commands = Arrays.asList("M");
        Application app = new Application();

        String result = app.reportLocation(new Rover(0,0,"N"),commands);
        String excepted ="(0,1 N)";

        assertThat(result).isEqualTo(excepted);
    }
}
