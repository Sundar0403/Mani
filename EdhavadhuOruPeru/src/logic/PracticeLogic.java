package logic;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PracticeLogic {

	public void getBinaryToHex(String newString) {

		String input = "";
		String decimal = "";

		int n = 0;
		for (int i = 0; i < newString.length(); i++) {
			if (newString.charAt(i) != '.' && n == 0) {
				input = input + newString.charAt(i);
			}

			else if (newString.charAt(i) == '.') {
				n++;
			}

			else if (newString.charAt(i) != '.' && n == 1) {
				decimal = decimal + newString.charAt(i);
			}
		}
		System.out.println(input);
		input = reverse(getValue(input));
		System.out.println(input);
		// decimal=reverse(decimal);
		System.out.println(decimal);
		decimal = reverse(getValue(reverse(decimal)));
		System.out.println(decimal);
		String value = input + "." + decimal;
		System.out.println(value);
	}

	private String getValue(String input) {
		String temp = "";
		// String temp2="";
		String value = "";
		// String value2="";
		int innerCount = 0;

		int count = 1;
		for (int i = input.length() - 1; i >= 0; i--) {
			temp = temp + input.charAt(i);
			if (innerCount == (4 * count) - 1) {
				temp = reverse(temp);
				System.out.println(temp);
				value = value + Integer.toHexString(getInteger(temp));
				temp = "";
				count++;
			}
			innerCount++;
		}
		int length = 4 - temp.length();
		for (int i = 0; i < length; i++) {
			temp = 0 + temp;
		}
		value = value + Integer.toHexString(getInteger(temp));
		return value;
	}

	private String reverse(String temp) {
		String rev = "";
		for (int i = temp.length() - 1; i >= 0; i--) {
			rev = rev + temp.charAt(i);
		}
		return rev;
	}

	private int getInteger(String temp) {
		int value = 0;
		int t = 0;
		int s = 1;
		int j = 2;
		for (int i = temp.length() - 1; i >= 0; i--) {
			if (i == temp.length() - 1) {
				String str = String.valueOf(temp.charAt(i));
				t = Integer.parseInt(str) * 1;
			} else {
				String str = String.valueOf(temp.charAt(i));
				// System.out.println(temp.charAt(i));
				int l = Integer.parseInt(str);
				// System.out.println("value"+l);
				int mul = (int) Math.pow(j, s);
				// System.out.println("mul"+mul);
				value = value + (l * mul);
				// System.out.println(value);
				s++;
			}
		}
		value = value + t;
		return value;
	}

	private void mergeSort(int[] arr, int i, int length) {
		if ((length - i) == 1) {
			return;
		}

		int middle = (length + i) / 2;

		mergeSort(arr, 0, middle);
		mergeSort(arr, middle, length);

		merge(arr, i, middle, length);
	}

	private void merge(int[] arr, int i, int middle, int length) {
		int result[] = new int[length - i];

		int l = i, j = middle, k = 0;

		while (l < middle && j < length) {
			if (arr[l] < arr[j]) {
				result[k++] = arr[l++];
			} else {
				result[k++] = arr[j++];
			}
		}
		while (l < middle) {
			result[k++] = arr[l++];
		}
		while (j < length) {
			result[k++] = arr[j++];
		}

		for (int x = 0; x < result.length; x++) {
			arr[i + x] = result[x];
		}

	}

	public int[] doMerge(int[] arr, int[] arr2) {
		int start = 0;
		int temp = 0;
		int end = arr.length - 1;
		while (end >= 0 && start < arr2.length) {
			if (arr[end] > arr2[start]) {
				temp = arr[end];
				arr[end] = arr2[start];
				arr2[start] = temp;
				start++;
				end--;
			} else {
				break;
			}
		}
		mergeSort(arr, 0, arr.length);
		mergeSort(arr2, 0, arr2.length);
		int result[] = new int[arr.length + arr2.length];
		System.out.println(Arrays.toString(arr));
		int i = 0, j = arr2.length - 1, k = 0;
		while (i < arr.length && j >= 0) {
			if (k % 2 == 0) {
				result[k++] = arr[i++];
			} else {
				result[k++] = arr2[j--];
			}
		}
		while (i < arr.length) {
			result[k++] = arr[i++];
		}
		while (j >= 0) {
			result[k++] = arr2[j--];
		}
		return result;
	}
	
	public void quickSort(int arr[],int low,int high)
	{
		if(low>high)
		{
			return;
		}
		
		int start=low;
		int end=high;
		int mid=(low+high)/2;
		
		int pivot=arr[mid];
		
		while(start<=end)
		{
			while(arr[start]<pivot)
			{
				start++;
			}
			while(arr[end]>pivot)
			{
				end--;
			}
			
			if(start<=end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		quickSort(arr,low,end);
		quickSort(arr,start,high);
	}

	public int[] clockwiseRotate(int[] arr) {
		int result[] = new int[arr.length];
		int d = 1;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int index = (length + i - d) % length;
			result[i] = arr[index];
		}
		return result;
	}

	public boolean checkKAnagram(String input, String second, int k) {
		int length = input.length();

		char ch1[] = input.toCharArray();
		char ch2[] = second.toCharArray();

		int count = 0;

		int arr[] = new int[26];

		for (int i = 0; i < length; i++) {
			arr[ch1[i] - 'a']++;
		}
		for (int i = 0; i < length; i++) {
			if (arr[ch2[i] - 'a'] > 0) {
				arr[ch2[i] - 'a']--;
			} else {
				count++;
			}
			if (count > k) {
				return false;
			}
		}

		return true;
	}

	public void waveArray(int[] arr, int num) {
		int temp = 0;
		for (int i = 0; i < num - 1; i = i + 2) {
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}

		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void alternativeSortArray(int[] arr, int num) {
		mergeSort(arr, 0, num);
		ArrayList<Integer> newList = new ArrayList<>();
		int start = 0;
		int end = num - 1;
		for (int i = 0; i < num - 1; i++) {
			newList.add(arr[end]);
			newList.add(arr[start]);
			start++;
			end--;
		}
		for (int i = 0; i < num; i++) {
			System.out.print(newList.get(i) + " ");
		}
	}

	public int balanced(int[] arr, int num) {
		int sum1 = 0;
		int sum2 = 0;
		int half = num / 2;
		for (int i = 0; i < half; i++) {
			sum1 = sum1 + arr[i];
		}
		for (int i = half; i < num; i++) {
			sum2 = sum2 + arr[i];
		}
		if (sum1 == sum2) {
			return 0;
		}
		return Math.abs(sum1 - sum2);
	}

	public int getGoodPairs(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public int getMinDiff(int[] arr, int num) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num - 1; i++) {
			min = getMin(min, getAbsolute(arr[i] - arr[i + 1]));
		}
		return min;
	}

	public int getMin(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}

	public int getAbsolute(int a) {
		if (a >= 0) {
			return a;
		}
		return (a * -1);
	}

	public ArrayList<Integer> getLeaders(int[] arr, int num) {
		ArrayList<Integer> newList = new ArrayList<>();
		int max = arr[num - 1];
		newList.add(max);
		for (int i = num - 2; i >= 0; i--) {
			if (max <= arr[i]) {
				max = arr[i];
				newList.add(max);
			}
		}
		newList = getReverse(newList);
		return newList;
	}

	private ArrayList<Integer> getReverse(ArrayList<Integer> newList) {
		ArrayList<Integer> reverse = new ArrayList<>();
		for (int i = newList.size() - 1; i >= 0; i--) {
			reverse.add(newList.get(i));
		}
		return reverse;
	}

	public int getMinDist(int[] arr, int num, int x, int y) {
		int min = Integer.MAX_VALUE;
		int firstDist = -1;
		int secondDist = -1;
		for (int i = 0; i < num; i++) {
			if (arr[i] == x) {
				firstDist = i;
			}
			if (arr[i] == y) {
				secondDist = i;
			}
			min = getMin(min, getAbsolute(firstDist - secondDist));
		}
		if (firstDist == -1 || secondDist == -1) {
			return -1;
		}
		return min;
	}

	public int[] getAlternativePositiveNegative(int[] arr, int num) {
		ArrayList<Integer> positiveList = new ArrayList<>();
		ArrayList<Integer> negativeList = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			if (arr[i] >= 0) {
				positiveList.add(arr[i]);
			} else {
				negativeList.add(arr[i]);
			}
		}

		int i = 0, j = 0, k = 0;
		while (i < positiveList.size() || j < negativeList.size()) {
			if (i < positiveList.size()) {
				arr[k++] = positiveList.get(i++);
			}
			if (j < negativeList.size()) {
				arr[k++] = negativeList.get(j++);
			}
		}
		return arr;
	}

	public boolean sumZero(int[] arr, int num) {
		HashMap<Integer, Integer> newMap = new HashMap<>();

		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum = sum + arr[i];
			if (sum == 0 || newMap.get(sum) != null) {
				return true;
			}
			newMap.put(sum, i);
		}
		return false;
	}

	public int nonRepeating(int[] arr, int num) {
		for (int i = 0; i < num; i++) {
			arr[arr[i] % num] = arr[arr[i] % num] + num;
		}
		for (int i = 0; i < num; i++) {
			if (arr[i] >= (2 * num)) {
				return i;
			}
		}
		return 0;
	}

	public int getMinElement(int[] arr, int start, int num) {
		int end = num - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == arr[end]) {
				end++;
			}

			else if (arr[mid] > arr[end]) {
				start = mid + 1;
			}

			else {
				start = mid;
			}
		}

		return arr[end];
	}

	public int[] getAbsoluteDiff(int[] arr, int num, int key) {
		mergeSortAbs(arr, 0, num, key);
		return arr;
	}

	private void mergeSortAbs(int[] arr, int i, int num, int key) {
		if ((num - i) == 1) {
			return;
		}

		int mid = (i + num) / 2;

		mergeSortAbs(arr, i, mid, key);
		mergeSortAbs(arr, mid, num, key);

		mergeAbs(arr, i, mid, num, key);
	}

	private void mergeAbs(int[] arr, int i, int mid, int num, int key) {
		int left[] = new int[mid - i];
		int right[] = new int[num - mid];
		int s = i;
		int m = mid;

		for (int j = 0; j < left.length; j++) {
			left[j] = arr[s + j];
		}

		for (int j = 0; j < right.length; j++) {
			right[j] = arr[m + j];
		}

		int j = 0, k = 0, l = i;

		while (j < left.length && k < right.length) {
			if (Math.abs(left[j] - key) <= Math.abs(right[k] - key)) {
				arr[l++] = left[j++];
			} else {
				arr[l++] = right[k++];
			}
		}
		while (j < left.length) {
			arr[l++] = left[j++];
		}
		while (k < right.length) {
			arr[l++] = right[k++];
		}
	}

	public int getClosest(int[] arr, int num) {
		mergeSort(arr, 0, num);

		int start = 0;
		int end = num - 1;
		int closest = arr[0] + arr[end];
		int sum = 0;

		while (start < end) {
			sum = arr[start] + arr[end];

			if (sum == 0) {
				return 0;
			}

			if (sum < 0) {
				start++;
			}

			else {
				end--;
			}

			if (getAbsolute(sum) < getAbsolute(closest)) {
				closest = sum;
			}

			if (getAbsolute(sum) == getAbsolute(closest)) {
				closest = getMax(closest, sum);
			}

		}
		return closest;
	}

	private int getMax(int closest, int sum) {
		if (closest > sum) {
			return closest;
		}
		return sum;
	}

	public int maxToys(int[] arr, int num, int key) {
		mergeSort(arr, 0, num);

		int sum = 0;
		for (int i = 0; i < num; i++) {

			if (sum + arr[i] > key) {
				return i;
			}
			sum += arr[i];
		}
		return 0;
	}

	int newCount = 0;

	public int getPalindrome(int num, int start) {

		if (isPalindrome(start)) {
			newCount++;
		}

		if (newCount == num) {
			return start;
		}
		return getPalindrome(num, ++start);
	}

	private boolean isPalindrome(int start) {
		int rem = 0;
		int rev = 0;
		int temp = start;
		while (start > 0) {
			rem = start % 10;
			rev = rem + rev * 10;
			start = start / 10;
		}
		if (rev == temp) {
			return true;
		}
		return false;
	}

	public boolean checkPermutn(String input, String check) 
	{
		List<String> newList=new ArrayList<>();
		String save="";
		
		permutn(input,save,newList);
		Collections.sort(newList);
		
		for(int i=0;i<newList.size();i++)
		{
			if(check.contains(newList.get(i)))
			{
				return true;
			}
		}
		
		return false;
	}

	private void permutn(String input, String save, List<String> newList) 
	{
		if(input.length()==0)
		{
			newList.add(save);
		}
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			String temp=input.substring(0,i)+input.substring(i+1,input.length());
			permutn(temp,save+ch,newList);
		}
	}

	public static String removeFragment(String[] s1)
	{
		int length=s1[0].length();
		String temp="";
		int count=0;
		ArrayList<String> list1=new ArrayList<>();
		for(int i=0;i<length;i++)
		{
			if(s1[0].charAt(i)==' ')
			{
				if(checkFragment(s1,temp) && count<3)
				{
	 
					count++;
					list1.add(temp);
					temp+=" ";
				}
				else
				{
				temp="";
				list1.clear();
				}
				if(count==3)
				{
					return list1.get(list1.size()-1);
				}
			}
			else
			{
				temp+=s1[0].charAt(i);
			}
			
			
			
			
		}
		if(checkFragment(s1,temp) && count<3)
		{
	 
			count++;
			list1.add(temp);
			temp+=" ";
		}	
		if(count==3)
		{
			return list1.get(list1.size()-1);
		}
		return "no consecutive words";
		
	}

	public static boolean checkFragment(String [] s1,String temp)
	{
		
		for(int i=0;i<s1.length;i++)
		{
			if(!s1[i].contains(temp))
			{
				return false;
			}
		}
		return true;
		
	}

}



