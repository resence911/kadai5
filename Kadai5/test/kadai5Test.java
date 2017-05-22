import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class kadai5Test {

	@Test
	public void test1() {
		 IntToEng ite = new IntToEng();
		 String expected = "one";
		 String actual = IntToEng.translateEng(1);
		 assertThat(actual, is(expected));
	}
	@Test
	public void test13() {
		 IntToEng ite = new IntToEng();
		 String expected = "thirteen";
		 String actual = IntToEng.translateEng(13);
		 assertThat(actual, is(expected));
	}
	@Test
	public void test65() {
		 IntToEng ite = new IntToEng();
		 String expected = "sixtyfive";
		 String actual = IntToEng.translateEng(65);
		 assertThat(actual, is(expected));
	}
	@Test
	public void test238() {
		 IntToEng ite = new IntToEng();
		 String expected = "twohundredthirtyeight";
		 String actual = IntToEng.translateEng(238);
		 assertThat(actual, is(expected));
	}
	@Test
	public void test1996() {
		 IntToEng ite = new IntToEng();
		 String expected = "onethousandninehundredninetysix";
		 String actual = IntToEng.translateEng(1996);
		 assertThat(actual, is(expected));
	}
	@Test
	public void test18762() {
		 IntToEng ite = new IntToEng();
		 String expected = "eighteenthousandsevenhundredsixtytwo";
		 String actual = IntToEng.translateEng(18762);
		 assertThat(actual, is(expected));
	}
	@Test
	public void test356423() {
		 IntToEng ite = new IntToEng();
		 String expected = "threehundredfiftysixthousandfourhundredtwentythree";
		 String actual = IntToEng.translateEng(356423);
		 assertThat(actual, is(expected));
	}
	@Test
	public void test9999999() {
		 IntToEng ite = new IntToEng();
		 String expected = "ninemillionninehundredninetyninethousandninehundredninetynine";
		 String actual = IntToEng.translateEng(9999999);
		 assertThat(actual, is(expected));
	}
	@Test
	public void test23253789() {
		 IntToEng ite = new IntToEng();
		 String expected = "twentythreemilliontwohundredfiftythreethousandsevenhundredeightynine";
		 String actual = IntToEng.translateEng(23253789);
		 assertThat(actual, is(expected));
	}
}
