package Sort2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		/* 병합정렬
		 * 전체 원소를 하나의 단위로 분할한 후 분할한 원소를 다시 병합하는 정
		*/
		
		/* 힙정렬
		 * 힙이라는 자료구조를 이용해서 정렬하는 방법
		 * 힙은 삭제 연산을 수행하면 가장 최상위 루트 원소를 반환한다. (힙의 정렬 기준에 따라 다르다)
		 * 힙이란 우선순위큐를 표현한 완전이진트리의 배열식 표현을 의미한다.
		 * 
		*/
		// 병합정렬만 구현함.
		
		/* 퀵정렬
		 * pivot 이용 . pivot을 고르고
		 * pivot 앞에는 pivot보다 작은값들, 뒤에는 큰값들로 분열.
		 * 재귀함수를 통해 반복.
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine().trim());
		
		if(count > 1000000 || count <1) {
			return;
		}
		
		int numbers[] = new int[count];
		List<Integer> nums = new ArrayList<Integer>();
		Set<Integer> numSet = new HashSet<Integer>();
		int number=0;
		
		long startTime = System.nanoTime();
		for(int i=0 ; i < count ; i++) {
//			numbers[i] = Integer.parseInt(br.readLine().trim());
			number = Integer.parseInt(br.readLine().trim());
			
			// 중복성 검사.
			if(i > 0 && nums.contains(number)) {
				return;
			} else{
				nums.add(number);
			}
			
		}
		Integer test[] = nums.toArray(new Integer[nums.size()]);
		 
		
//		merge_sort(numbers, 0 ,numbers.length-1);
//		nums = ListMergeSort(nums);
//		for(int k : nums) {
//			System.out.println(k);
//		}
		
		quickSort(test, 0, test.length-1);
		for(int k : test) {
			System.out.println(k);
		}
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime); //1179261948
		
//		for(int i=0 ; i < numbers.length ; i++) {
//			System.out.println(numbers[i]);
//		}
		
	
	}
	
	
//	public static void merge_sort(int arr[] , int left, int right){
//		int mid;
//		if(left < right) {
//			mid = (left + right) /2;
//			merge_sort(arr,left,mid); // 왼쪽 블록 병
//			merge_sort(arr, mid+1 , right); // 오른쪽 블록 병합.
//			
//			merge(arr,left,mid,right); // 분할된 블록 병합.
//		}
//		
//	}
//	
//	public static void merge(int arr[], int left, int mid, int right){
//		int leftPtr =left;
//		int rightPtr= mid+1;
//		int index=left;
//		
//		int tempArray[] = new int[right+1];
//		
//		while(leftPtr <= mid && rightPtr <= right) {
//			if(arr[leftPtr] < arr[rightPtr]) {
//				tempArray[index] = arr[leftPtr];
//				leftPtr++;
//			}else {
//				tempArray[index] = arr[rightPtr];
//				rightPtr++;
//			}
//			index++;
//		}
//		
//		
//		// left블록의 값은 처리 되었는데 오른쪽이 남아있을 경우
//		// right index를 순차적으로 결과에 복사.
//		
//		if(leftPtr > mid) {
//			while(rightPtr <= right) {
//				tempArray[index] = arr[rightPtr];
//				index++;
//				rightPtr++;
//			}
//			
//		}else {
//			while(leftPtr <= mid) {
//				tempArray[index] = arr[leftPtr];
//				index++;
//				leftPtr++;
//			}
//			
//		}
//		
//		
//		for(int t = 0 ; t < tempArray.length ; t++) {
////			System.out.print(tempArray[t]);
//			if(t==tempArray.length-1) {
////				System.out.println();
//			}
//		}
//		
//		
//		
//		// i =0 으로 하면 결과 안나옴. i = left로 해줘야 값이 제대로 나오는데
//		// 이유를 모르겠네...값을 덮어쓰나.
//		for(int i=left ; i <= right ; i++) {
//			arr[i] = tempArray[i];
//		}
//		
//		
//	}
//	
	
	// List를 이용한 병합정렬이 더 이해하기가 쉽다.
	
	
	public static List<Integer> ListMergeSort(List values) {
		if(values.size() < 2) {
			return values;
		}
		List<Integer> leftHalf = values.subList(0, values.size()/2);
		List<Integer> rightHalf = values.subList(values.size()/2, values.size());
		
		return ListMerge(ListMergeSort(leftHalf) , ListMergeSort(rightHalf));
		
	}
	
	public static List<Integer> ListMerge(List<Integer> leftHalf , List<Integer> rightHalf) {
		int leftPtr=0;
		int rightPtr=0;
		
		List<Integer> mergedList = new ArrayList<Integer>(leftHalf.size() + rightHalf.size());
		
		while(leftPtr < leftHalf.size() && rightPtr < rightHalf.size()) {
			if(leftHalf.get(leftPtr) < rightHalf.get(rightPtr)) {
				mergedList.add(leftHalf.get(leftPtr));
				leftPtr++;
			} else {
				mergedList.add(rightHalf.get(rightPtr));
				rightPtr++;
			}
		}
		
		while(leftPtr < leftHalf.size()) {
			mergedList.add(leftHalf.get(leftPtr));
			leftPtr++;
		}
		while(rightPtr < rightHalf.size()) {
			mergedList.add(rightHalf.get(rightPtr));
			leftPtr++;
		}
		
		
		return mergedList;
	}
	
	
	public static void quickSort(Integer[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];
        
        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){    
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(l < right) quickSort(data, l, right);
        if(r > left) quickSort(data, left, r);
    }
	
	
	

}
