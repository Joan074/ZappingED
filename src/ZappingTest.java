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
        assertEquals(20,control);
        System.out.println("Test Correcto");
    }

    @Test
    void ZappingTest4(){
        //action
        int control = Zapping.Canales(2,99);
        //assert
        assertEquals(2,control);
        System.out.println("Test Correcto");
    }

    @Test
    void ZappingTest5(){
        //action
        int control = Zapping.Canales(5,63);
        //assert
        assertEquals(41,control);
        System.out.println("Test Correcto");
    }

    @Test
    void ZappingTest6(){
        //action
        int control = Zapping.Canales(63,5);
        //assert
        assertEquals(41,control);
        System.out.println("Test Correcto");
    }

    @Test
    void ZappingTest7(){
        //action
        int control = Zapping.Canales(1,51);
        //assert
        assertEquals(49,control);
        System.out.println("Test Correcto");
    }
}