/*
 * This file is released under terms of BSD license
 * See LICENSE file for more information
 */

package cx2x.translator.language;

import java.util.List;

/**
 * Store the information from a reshape option in a CLAW directives.
 *
 * @author clementval
 */
public class ClawReshapeInfo {
  private final String _array_name;
  private final int _target_dimension;
  private final List<String> _kept_dimensions;

  /**
   * Constructs a new ClawReshapeInfo object with all its needed information.
   * @param dimension       Number of dimension after reshape transformation.
   * @param kept_dimensions Optional, if target dimension is bigger than 0 then
   *                        this list informs which dimension is preserved.
   */
  ClawReshapeInfo(String array_name, int dimension,
                  List<String> kept_dimensions)
  {
    _array_name = array_name;
    _target_dimension = dimension;
    _kept_dimensions = kept_dimensions;
  }

  /**
   * Get the extracted array name.
   * @return Array name as string value.
   */
  public String getArrayName(){
    return _array_name;
  }

  /**
   * Get the target dimension extracted from the reshape clause.
   * @return Target dimension value.
   */
  public int getTargetDimension(){
    return _target_dimension;
  }

  /**
   * Get the extracted kept dimension as a list of strings.
   * @return List of kept dimensions if any. List is empty if this information
   * is not present.
   */
  public List<String> getKeptDimensions(){
    return _kept_dimensions;
  }

}