import org.example.Main
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainTest{
    private val testClass : Main = Main()

    @Test
    fun testNegativeValues() {
        assertEquals(-1, testClass.getAcuteAngleOfTime(-1,-1));
        assertEquals(-1, testClass.getAcuteAngleOfTime(-2,10));
        assertEquals(-1, testClass.getAcuteAngleOfTime(112,-100));
    }

    @Test
    fun testExceedingValues(){
        assertEquals(-1, testClass.getAcuteAngleOfTime(25,0));
        assertEquals(-1, testClass.getAcuteAngleOfTime(2,61));
        assertEquals(-1, testClass.getAcuteAngleOfTime(180,181));
        assertEquals(-1, testClass.getAcuteAngleOfTime(24,0));
    }

    @Test
    fun testBoundaryValues(){
        assertEquals(0,testClass.getAcuteAngleOfTime(0,0));
        assertEquals(6,testClass.getAcuteAngleOfTime(23,59));
        assertEquals(6,testClass.getAcuteAngleOfTime(0,1));
        assertEquals(6,testClass.getAcuteAngleOfTime(12,1));
        assertEquals(6,testClass.getAcuteAngleOfTime(11,59));
        assertEquals(174,testClass.getAcuteAngleOfTime(18,1));
        assertEquals(15,testClass.getAcuteAngleOfTime(6,30));
        assertEquals(10,testClass.getAcuteAngleOfTime(6,31));
    }

    @Test
    fun testAM_And_PMCounterparts(){
        assertEquals(0,testClass.getAcuteAngleOfTime(12,0));
        assertEquals(0,testClass.getAcuteAngleOfTime(0,0));

        assertEquals(30,testClass.getAcuteAngleOfTime(1,0));
        assertEquals(30,testClass.getAcuteAngleOfTime(13,0));

        assertEquals(90,testClass.getAcuteAngleOfTime(3,0));
        assertEquals(90,testClass.getAcuteAngleOfTime(15,0));

        assertEquals(180,testClass.getAcuteAngleOfTime(6,0));
        assertEquals(180,testClass.getAcuteAngleOfTime(18,0));
    }

    @Test
    fun testRandomValues(){
        assertEquals(118,testClass.getAcuteAngleOfTime(0,44));
        assertEquals(-1,testClass.getAcuteAngleOfTime(12,60));
        assertEquals(-1,testClass.getAcuteAngleOfTime(11,60));
        assertEquals(162,testClass.getAcuteAngleOfTime(12,36));
        assertEquals(142,testClass.getAcuteAngleOfTime(3,56));
        assertEquals(7,testClass.getAcuteAngleOfTime(18,34));
    }
}