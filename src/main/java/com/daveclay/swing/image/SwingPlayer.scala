package com.daveclay.swing.image

import java.awt.Image
import javax.swing.{JPanel, JFrame}

object SwingUIHelper {
    def openInFrame(panel: JPanel) = {
        val jframe = new JFrame("Simple Image Viewer")
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        jframe.setContentPane(panel)
        jframe.pack()
        jframe.setVisible(true)

    }
}

object ImageViewerUI {
    def open(image:Image) {
        open(image, 0)
    }

    def open(image:Image, time:Int) {
        SwingUIHelper.openInFrame(new ImageComponent(image))
        Thread.sleep(time)
    }
}






