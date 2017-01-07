package com.jie.design.pattern;

public class ProxyPattern {
	// a class represents functionality of another class, e.g. wsdl
	public interface Image {
		void display();
	}

	public class RealImage implements Image {

		private String fileName;

		public RealImage(String fileName) {
			this.fileName = fileName;
			loadFromDisk(fileName);
		}

		@Override
		public void display() {
			System.out.println("Displaying " + fileName);
		}

		private void loadFromDisk(String fileName) {
			System.out.println("Loading " + fileName);
		}
	}

	public class ProxyImage implements Image {

		private RealImage realImage;
		private String fileName;

		public ProxyImage(String fileName) {
			this.fileName = fileName;
		}

		@Override
		public void display() {
			if (realImage == null) {
				realImage = new RealImage(fileName);
			}
			realImage.display();
		}
	}

	public static void main(String[] args) {
		Image image = new ProxyPattern().new ProxyImage("abc.jpg");
		image.display();
	}
}
