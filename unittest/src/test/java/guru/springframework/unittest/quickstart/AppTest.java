package guru.springframework.unittest.quickstart;


import static org.junit.Assert.assertEquals;

public class AppTest {
    private App theRest = new App();
    private String s1 = "s1";
    private String s2 = "s2";
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void concatAndConvertString() {
        String result= theRest.concatAndConvertString(s1,s2);
        String expectedResult = "S1S2";
        assertEquals(result,expectedResult);

    }

}