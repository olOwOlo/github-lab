import org.junit.Test;

/**
 * @author olOwOlo
 */

public class SimpleBeanTest {

  @Test
  public void test() {
    SimpleBean simpleBean = new SimpleBean();
    simpleBean.setFirstName("");
    simpleBean.setLastName("");
    if (!simpleBean.getFirstName().equals(simpleBean.getLastName())) {
      throw new RuntimeException("");
    }
  }
}
