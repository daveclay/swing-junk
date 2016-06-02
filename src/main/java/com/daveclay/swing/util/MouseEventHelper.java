package com.daveclay.swing.util;

import java.awt.event.MouseEvent;

public class MouseEventHelper {

	public static boolean isMouseButtonDown(MouseEvent mouseEvent) {
		return (mouseEvent.getModifiersEx() & MouseEvent.BUTTON1_DOWN_MASK) == MouseEvent.BUTTON1_DOWN_MASK;
	}
}
