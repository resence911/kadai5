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
	public void test13() {
		 IntToEng ite = new IntToEng();
		 String expected = "thirteen";
		 String actual = IntToEng.translateEng(13);
		 assertThat(actual, is(expected));
	}
	public void test65() {
		 IntToEng ite = new IntToEng();
		 String expected = "sixtyfive";
		 String actual = IntToEng.translateEng(65);
		 assertThat(actual, is(expected));
	}
	public void test238() {
		 IntToEng ite = new IntToEng();
		 String expected = "twohundredthirtyeight";
		 String actual = IntToEng.translateEng(238);
		 assertThat(actual, is(expected));
	}
	public void test1996() {
		 IntToEng ite = new IntToEng();
		 String expected = "one";
		 String actual = IntToEng.translateEng(1996);
		 assertThat(actual, is(expected));
	}
}
