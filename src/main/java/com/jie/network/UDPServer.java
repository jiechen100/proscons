import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class UDPServer {
    public static void main(String args[]) {
        DatagramSocket serverSocket = null;
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];

        try {
            serverSocket = new DatagramSocket(9876);

            while (true) {

                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String sentence = new String(receivePacket.getData());
                System.out.println("RECEIVED: " + sentence);
                InetAddress ipAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();
                String capitalizedSentence = sentence.toUpperCase();
                sendData = capitalizedSentence.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, port);
                serverSocket.send(sendPacket);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }

    }
}
