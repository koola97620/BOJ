package Question4811;

/*
70세 박종수 할아버지는 매일 매일 약 반알을 먹는다. 손녀 선영이는 종수 할아버지에게 약이 N개 담긴 병을 선물로 주었다.
첫째 날에 종수는 병에서 약 하나를 꺼낸다. 그 다음, 그 약을 반으로 쪼개서 한 조각은 먹고, 다른 조각은 다시 병에 넣는다.
다음 날부터 종수는 병에서 약을 하나 꺼낸다. (약은 한 조각 전체 일 수도 있고, 쪼갠 반 조각 일 수도 있다) 반 조각이라면 그 약을 먹고, 아니라면 반을 쪼개서 한 조각을 먹고, 다른 조각은 다시 병에 넣는다.
종수는 손녀에게 한 조각을 꺼낸 날에는 W를, 반 조각을 꺼낸 날에는 H 보낸다. 손녀는 할아버지에게 받은 문자를 종이에 기록해 놓는다. 총 2N일이 지나면 길이가 2N인 문자열이 만들어지게 된다. 이때, 가능한 서로 다른 문자열의 개수는 총 몇 개일까?
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    setTestcase(br);


  }

  public static void setTestcase(BufferedReader br) throws IOException {

    while(true) {
      int num = Integer.parseInt(br.readLine());
      if(num == 0) {
        return;
      } else {
        num = 2 *num;
        long count = getCount(num);
        System.out.println(count);
      }
    }

  }

  public static long getCount(int n) {
    // n : 약의 개수.
    // 길이가 2n 인 문자열에 W,H 를 마구 넣는다.?
    // WH 를 계산해서 남은게 없는것만 카운트 한다.
    // w의 총 개수는 n개. h 의 총 개수도 n 개.

    StringBuffer sb = new StringBuffer('W');
    //long count = getCount(sb,n);



    return 0;
  }

  public static StringBuffer getCount(StringBuffer sb,int n) {
    if(sb.length() >= n) {

    } else {
      sb.append('W');
      return getCount(sb,n);
    }


    return null;
  }



}
