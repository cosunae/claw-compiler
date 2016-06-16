/*
 * This file is released under terms of BSD license
 * See LICENSE file for more information
 */

package cx2x.xcodeml.xnode;

import helper.XmlHelper;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the features of the XdeclTable class.
 *
 * @author clementval
 */
public class XdeclTableTest {

  private static final String decl1 =
      "<declarations>" +
      "<varDecl lineno=\"4730\" file=\"dummy.f90\">" +
      "<name type=\"I1241bd0\">name1</name>" +
      "</varDecl>\n" +
      "<varDecl lineno=\"4731\" file=\"dummy.f90\">" +
      "<name type=\"I1241c70\">name2</name>" +
      "</varDecl>" +
      "</declarations>";


  @Test
  public void simpleDeclTableTest(){
    XdeclTable decl = XmlHelper.createXdeclTable(decl1);
    assertNotNull(decl);
    assertEquals(2, decl.count());

    XvarDecl var1 = decl.get("name1");
    assertNotNull(var1);
    assertEquals(4730, var1.getLineNo());
    assertEquals("dummy.f90", var1.getFile());
    assertEquals("name1", var1.getName().getValue());
    assertEquals("I1241bd0", var1.getName().getAttribute(Xattr.TYPE));

    XvarDecl var2 = decl.get("name2");
    assertNotNull(var2);
    assertEquals(4731, var2.getLineNo());
    assertEquals("dummy.f90", var2.getFile());
    assertEquals("name2", var2.getName().getValue());
    assertEquals("I1241c70", var2.getName().getAttribute(Xattr.TYPE));
  }
}