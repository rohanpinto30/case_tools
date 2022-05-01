import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)

class MarksheetTest {
	Marksheet msk;
	int [] actualInput;
	int [] expectedInput;
	@BeforeAll
	void setUp() {
		msk=new Marksheet();
		actualInput=new int[5];
		expectedInput=new int[5];
		
	}

	@Test
	@Order(1)
	void testReadMarks() {
		msk.ReadMarks();
		expectedInput[0]=80;
		expectedInput[1]=50;
		expectedInput[2]=60;
		expectedInput[3]=60;
		expectedInput[4]=50;
		
		 actualInput[0]=msk.getMarks1();
		 actualInput[1]=msk.getMarks2();
		 actualInput[2]=msk.getMarks3();
		 actualInput[3]=msk.getMarks4();
		 actualInput[4]=msk.getMarks5();
		assertArrayEquals(actualInput,expectedInput);
		
	}

	
	@Test
	@Order(2)
	void testFindtotalMarks() {
		msk.FindtotalMarks();
		assertEquals(300,msk.getTotalmarks());
	}

	@Test
	@Order(3)
	void testFindPercentage() {
		msk.FindPercentage();
		assertEquals(60,msk.getPercentage());
		
		
	}

	@Test
	@Order(4)
	void testFindGrade() {
		assertEquals('C',msk.FindGrade());
	}

}
