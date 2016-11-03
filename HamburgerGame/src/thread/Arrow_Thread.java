package thread;

public class Arrow_Thread extends Thread {
	Arrow_Panel canvas;
	private int swx = 3, speed = 5;

	public Arrow_Thread(Arrow_Panel c) {
		canvas = c;
	}

	public void run() {
		try {
			while (true) {
				if (canvas.getAX() < 10 || canvas.getAX() > canvas.getWidth() - 50) {
					swx *= -1; // ���� ���� ������ �ݴ�� �����̰� ��
				}
				canvas.setAX(swx); // �� �����̱�
				canvas.repaint();
				sleep(speed); // �ӵ� ����
			}
		} catch (Exception e) {
		}
	}
	public void setSpeed(){
		speed -= 1;
	}
}
