import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @Test
    void ZappingTest1(){
        //action
        int control = Zapping.Canales(0,0);
        //assert
        assertEquals(0,control);
        System.out.println("Test Correcto");
    }

    @Test
    void ZappingTest2(){
        //action
        int control = Zapping.Canales(1,2);
        //assert
        assertEquals(1,control);
        System.out.println("Test Correcto");
    }

    @Test
    void ZappingTest3(){
        //action
        int control = Zapping.Canales(10,30);
        //assert
    }

    @Test
    void ZappingTest4(){
        //action
        int control = Zapping.Canales(,);
        //assert
    }

    @Test
    void ZappingTest5(){
        //action
        int control = Zapping.Canales(,);
        //assert
    }

    @Test
    void ZappingTest6(){
        //action
        int control = Zapping.Canales(1,2);
        //assert
    }

    @Test
    void ZappingTest7(){
        //action
        int control = Zapping.Canales(1,2);
        //assert
    }
}