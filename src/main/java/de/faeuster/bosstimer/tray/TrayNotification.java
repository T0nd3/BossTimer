package de.faeuster.bosstimer.tray;

import java.awt.*;

public class TrayNotification {

    public void notifyOverTray(String message) throws AWTException {
        SystemTray tray = SystemTray.getSystemTray();
        Image image = Toolkit.getDefaultToolkit().createImage("resources/bdo_icon.png");

        TrayIcon trayIcon = new TrayIcon(image);
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("Boss-Spawn steht bevor", message, TrayIcon.MessageType.INFO);
    }
}