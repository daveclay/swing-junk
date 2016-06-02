package com.daveclay.swing.util;


import javax.swing.*;

import static com.daveclay.swing.util.Position.position;
import static com.daveclay.swing.util.Size.fit;

/**
 */
public class EnumSelectorPanel<E extends Enum> extends JPanel {

	private EnumSelector<E> selectorBox;
	protected Class<E> type;

	public EnumSelectorPanel(Class<E> type) {
		this.type = type;
		buildGUI();
	}

	protected void buildGUI() {
		this.selectorBox = new EnumSelector<E>(type);
		position(selectorBox).atOrigin().in(this);
		fit(selectorBox).in(this);
	}

	public E getSelectedValue() {
		return selectorBox.getValue();
	}

	public void select(E value) {
		selectorBox.setSelectedItem(value.name());
	}
}
