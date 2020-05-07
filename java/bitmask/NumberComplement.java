package mayChallenge;

public class NumberComplement {
	
	//<����Ǯ��1>
	
	//��Ʈ������ ���� ��̳� ����.
	
	//num�� 5�϶�, num�� complement�� 2����.
	
	//�̰� �����̳ĸ�, ���� 5�� 2����(bitmask)�� �ٲٸ�
	
	//0000 0000 0000 0000 0000 0000 0000 0101
	
	//�̷��� �ȴ�.
	
	//���⼭ �� �������� complement�� �տ� ������ ������ 0���� ����, ������ 101�� ������ ���� ��,
	
	//1�� 0����, 0�� 1�� �ٲ� ���̴�. ��, �Ʒ��� ���� �ȴ�.
	
	//0000 0000 0000 0000 0000 0000 0000 0010
	
	//�׸��� �� �������� �ٽ� ���ڷ� ��ȯ�ϸ� 2��� ���ڰ� ���´�.
	
	//������ ��� �־��� num�� complement�� ���ڷ� �ٲٳĴ°��ε�..
	
	//�ϴ� ���ʿ� ������ ������ 0���� ��¥�� �Ⱦ��ϱ�, ���� ù��°�� �����ϴ� 1�� ��ġ�� ã��,
	
	//�ű⼭���� ������ for���� ���鼭, 1�̸� 0���� �ٲ��ְ�, 0�̸� 1�� �ٲ��ָ� �ǰ���?
	
	//�׷�  ���� ù������ �����ϴ� 1�� ��ġ�� ��� ã����?
	
	//�ڹ� Integer class���� �����ϴ� .numberOfLeadingZeros()�� �̿��ϸ�, �� ù��° 1�� ������ �������� ������� �����ϴ��� �� �� �ִ�.
	
	//�׸��� 1->0, 0->1�� �ٲٴ� ����, num = num ^ (1<<i); �� �̿��ϸ� �ȴ�.
	
	//���⼭ ^�����ڴ� xor ���������ڷ�, �� bitmask�� ������ ��, ������ 0����, �ٸ��� 1�� ������ִ� ���̰�,
	
	//(1<<i)���� <<��, 
	
	//0000 0000 0000 0000 0000 0000 0000 0000
	
	//���⿡�� �� ������ �������� i��ŭ �̵� ��, 1�� �ٲ��ֶ�� ���̴�.
	
	//�������, (1<<3)��
	
	//0000 0000 0000 0000 0000 0000 0000 0100
	
	//�� �Ǿ�, 8�̵ȴ�.
	
	//�׷��� num = num ^ (1<<i); �̰� ��ü �����̳�.
	
	//5�� ��Ʈ����ũ�� �̷��� ����� �׷���?
	
	//0000 0000 0000 0000 0000 0000 0000 0101
	
	//�׸��� 31 - Integer.numberOfLeadingZeros(num);�� 3�̰���?
	
	//(1<<i)�� ���������� ���� 3��° ĭ�� 0�� 1�� �ٲ��ֶ�°ž�.
	
	//�׷� �̷��� �ǰ���?
	
	//0000 0000 0000 0000 0000 0000 0000 0100
	
	//�� ����, �̰Ŷ� num�̶� xor������(^)�� �ϴ°ž�.
	
	//0000 0000 0000 0000 0000 0000 0000 0101  (xor)
	//0000 0000 0000 0000 0000 0000 0000 0100
	
	//xor������ ����׷�����? ������ 0, �ٸ��� 1�� �ٲ��ش� �׷���?
	
	//�׷� ���ʿ� �׿��ִ� 0���� �Ѵ� �Ȱ��� 0�̴ϱ�, �ٲ�°� ���� 
	
	//�����ʿ��� ���� 3��° ĭ�� 1�� �����ϱ� 0���� �ǰ���?
	
	//�׷� �̷��� ��.
	
	//0000 0000 0000 0000 0000 0000 0000 0001
	
	//�ι�° loop���� num = num ^ (1<<i);�� �� ��, i�� 2�ϱ�,
	
	//0000 0000 0000 0000 0000 0000 0000 0010 �� �ǰ���?
	
	//�׷�,
	
	//0000 0000 0000 0000 0000 0000 0000 0010 (xor)
	//0000 0000 0000 0000 0000 0000 0000 0001
	
	//�ϸ�, 
	
	//0000 0000 0000 0000 0000 0000 0000 0011
	
	//�̷��� �Ǳ�.
	
	//�������� 1<<1�� xor�ϸ�,
	
	//0000 0000 0000 0000 0000 0000 0000 0011 (xor)
	//0000 0000 0000 0000 0000 0000 0000 0001
	
	//������� 
	
	//0000 0000 0000 0000 0000 0000 0000 0010
	
	//�̷��� �ǰ���?
	
	//�̰� ���ڷ� �ٲ۰� 2��. �׷��� ���� 2�� �Ǵ°ž�.
	
	// 149 / 149 test cases passed.
    // Status: Accepted
    // Runtime: 0 ms
    // Memory Usage: 36.5 MB
    public int findComplement(int num) {
        for(int i = 31 - Integer.numberOfLeadingZeros(num); i >= 0; i--) {
			num = num ^ (1<<i);
		}
        return num;
    }
}