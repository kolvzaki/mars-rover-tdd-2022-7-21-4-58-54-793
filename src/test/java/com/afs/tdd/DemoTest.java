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

    @Test
    void given_0_0_n_l_when_execute_command_return_0_0_W(){
        List<String> commands = Arrays.asList("L");
        Application app = new Application();

        String result = app.reportLocation(new Rover(0,0,"N"),commands);
        String excepted ="(0,0 W)";

        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void given_0_0_n_r_when_execute_command_return_0_0_E(){
        List<String> commands = Arrays.asList("R");
        Application app = new Application();

        String result = app.reportLocation(new Rover(0,0,"N"),commands);
        String excepted ="(0,0 E)";

        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void given_0_0_s_w_when_execute_command_return_0_negative_1_S(){
        List<String> commands = Arrays.asList("M");
        Application app = new Application();

        String result = app.reportLocation(new Rover(0,0,"S"),commands);
        String excepted ="(0,-1 S)";

        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void given_0_0_s_l_when_execute_command_return_0_0_E(){
        List<String> commands = Arrays.asList("L");
        Application app = new Application();

        String result = app.reportLocation(new Rover(0,0,"S"),commands);
        String excepted ="(0,0 E)";

        assertThat(result).isEqualTo(excepted);
    }
}
