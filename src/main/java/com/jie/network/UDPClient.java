import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class UDPClient {
    public static void main(String args[]) {

        BufferedReader inFromUser = null;
        DatagramSocket clientSocket = null;
        DatagramPacket sendPacket = null;
        DatagramPacket receivePacket = null;
        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        try {

            inFromUser = new BufferedReader(new InputStreamReader(System.in));
            clientSocket = new DatagramSocket();
            InetAddress ipAddress = InetAddress.getByName("localhost");

            while (true) {

                String sentence = inFromUser.readLine();
                sendData = sentence.getBytes();
                if (sendPacket == null) {
                    sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, 9876);
                } else {
                    sendPacket.setData(sendData, 0, sendData.length);
                }
                clientSocket.send(sendPacket);

                if (receivePacket == null) {
                    receivePacket = new DatagramPacket(receiveData, receiveData.length);
                } else {
                    receivePacket.setData(receiveData);
                    receivePacket.setLength(receiveData.length);
                }
                clientSocket.receive(receivePacket);

                String modifiedSentence = new String(receivePacket.getData());
                System.out.println("FROM SERVER:" + modifiedSentence);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (clientSocket != null) {
                clientSocket.close();
            }

            if (inFromUser != null) {
                try {
                    inFromUser.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
