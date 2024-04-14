package resources;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.nio.charset.*;
import javax.swing.*;


public class ResourceTest {
    public static void main(String[] args) throws IOException {
        Class cl = ResourceTest.class;
        URL aboutURL = cl.getResource("about.gif");
        var icon  = new ImageIcon(aboutURL);

        InputStream stream = cl.getResourceAsStream("data/about.txt");
        var about = new String(stream.readAllBytes(), "UTF-8");

        InputStream stream2 = cl.getResourceAsStream("/corejava/title.txt");
        var title = new String(stream2.readAllBytes(), StandardCharsets.UTF_8).strip();

        JOptionPane.showMessageDialog(
            null, about, title, JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
