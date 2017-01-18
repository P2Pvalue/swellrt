package org.swellrt.beta.model;

public class SSuplementNode implements SNode {

  private final SNode node;
  private final boolean readOnly;
  
  public SSuplementNode(SNode node, boolean readOnly, boolean autoGenerated) {
    super();
    this.node = node;
    this.readOnly = readOnly;
  }

  public SNode getNode() {
    return node;
  }

  public boolean isReadOnly() {
    return readOnly;
  }
  
  
}
