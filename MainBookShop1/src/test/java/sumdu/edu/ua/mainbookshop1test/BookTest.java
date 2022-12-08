package sumdu.edu.ua.mainbookshop1test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import sumdu.edu.ua.mainbookshop1.Book;

public class BookTest {
    Book ab=null;
   
    @BeforeAll
    public void annotInform(){
        ab=new Book();
    }
    
    /*public void toStringTest(){
        Book a=new Book(42,"Rowling","Harry Potter");
        System.out.print("42 Rowling Harry Potter &="+a.toSting());
        assertEquals("42 Rowling Harry Potter",a.toSting());
    }*/
    
    @Test
    public void getAuthorTest(){
        assertNull(ab.getAuthor());
    }
    
}
