import junit.framework.TestCase;

public class TestJUnit extends TestCase{
    
    private IMap map;
    
    public TestJUnit(){
        map = Factory.create("1");
    }
    
    public void testSeparate(){
        String all = ReaderTxt.readFile("docs\\ListadoProducto.txt");
        System.out.println("Probando Doc:");
        System.out.println(all);

        // IMap the_new_imap = ReaderTxt.bringMap(all, map);

        // assertEquals(null, the_new_imap);
    }

}
