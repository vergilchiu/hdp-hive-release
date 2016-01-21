/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.ql.plan.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum AdjacencyType implements org.apache.thrift.TEnum {
  CONJUNCTIVE(0),
  DISJUNCTIVE(1);

  private final int value;

  private AdjacencyType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static AdjacencyType findByValue(int value) { 
    switch (value) {
      case 0:
        return CONJUNCTIVE;
      case 1:
        return DISJUNCTIVE;
      default:
        return null;
    }
  }
}
