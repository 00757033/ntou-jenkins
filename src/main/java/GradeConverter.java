/**

 * set default mock parameter.（方法說明）


 * @return data manager(返回值說明)

 * @throws Exception if has error(異常說明)

 */
public class GradeConverter {
  /**

   * set default mock parameter.（方法說明）



   * @return data manager(返回值說明)

   * @throws Exception if has error(異常說明)

   */
  public String convert(int score) {
    if (score <= 100 && score > 90) {
      return "A";
    } else if (score <= 89 && score > 80) {
      return "B";
    } else if (score <= 79 && score > 70) {
      return "C";
    } else if (score <= 69 && score > 60) {
      return "D";
    } else if (score <= 59 && score > 0) {
      return "E";
    } else {
      return "Invalid";
    }
  }

}