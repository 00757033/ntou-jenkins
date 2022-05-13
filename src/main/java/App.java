/**

 * set default mock parameter.（方法說明）


 * @return data manager(返回值說明)

 * @throws Exception if has error(異常說明)

 */
public class App {
  /**

   * set default mock parameter.（方法說明）

   */
  public static void main(String[] args) {
    GradeConverter converter = new GradeConverter();
    for (int i = 0; i < 105; i++) {
      System.out.println(i + converter.convert(i) + ";");
    }
  }
}
