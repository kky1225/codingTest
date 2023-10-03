package level2.exam20_29;

import java.util.HashMap;
import java.util.Map;

/*
 * 문제 이름 : 할인 행사
 * 문제 설명 : XYZ 마트는 일정한 금액을 지불하면 10일 동안 회원 자격을 부여합니다. XYZ 마트에서는 회원을 대상으로 매일 한 가지 제품을 할인하는 행사를 합니다. 할인하는 제품은 하루에 하나씩만 구매할 수 있습니다. 알뜰한 정현이는 자신이 원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치할 경우에 맞춰서 회원가입을 하려 합니다.
			예를 들어, 정현이가 원하는 제품이 바나나 3개, 사과 2개, 쌀 2개, 돼지고기 2개, 냄비 1개이며, XYZ 마트에서 15일간 회원을 대상으로 할인하는 제품이 날짜 순서대로 치킨, 사과, 사과, 바나나, 쌀, 사과, 돼지고기, 바나나, 돼지고기, 쌀, 냄비, 바나나, 사과, 바나나인 경우에 대해 알아봅시다. 첫째 날부터 열흘 간에는 냄비가 할인하지 않기 때문에 첫째 날에는 회원가입을 하지 않습니다. 
			둘째 날부터 열흘 간에는 바나나를 원하는 만큼 할인구매할 수 없기 때문에 둘째 날에도 회원가입을 하지 않습니다. 셋째 날, 넷째 날, 다섯째 날부터 각각 열흘은 원하는 제품과 수량이 일치하기 때문에 셋 중 하루에 회원가입을 하려 합니다.
			정현이가 원하는 제품을 나타내는 문자열 배열 want와 정현이가 원하는 제품의 수량을 나타내는 정수 배열 number, XYZ 마트에서 할인하는 제품을 나타내는 문자열 배열 discount가 주어졌을 때, 회원등록시 정현이가 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수를 return 하는 solution 함수를 완성하시오. 가능한 날이 없으면 0을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/131127
 * */
public class exam23 {

	// 내 풀이
	public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for(int i=0;i<discount.length-9;i++) {
            answer = discountDay(createMap(want, number), discount, answer, i);
        }
        
        return answer;
    }
    
    public Map<String, Integer> createMap(String[] want, int[] number) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<want.length;i++) {
            map.put(want[i], number[i]);
        }
        
        return map;
    }
    
    public int discountDay(Map<String, Integer> map, String[] discount, int answer, int i) {
        boolean check = true;
        
        for(int j=i;j<i+10;j++) {
            if(map.containsKey(discount[j])) {
                map.put(discount[j], map.get(discount[j]) - 1);
            }
        }   
            
        for(int count : map.values()) {
            if(count > 0) {
                check = false;
                break;
            }
		}
            
        if(check) {
            answer++;
        }
        
        return answer;
    }
    
 // 남의 풀이
 /* public int solution(String[] want, int[] number, String[] discount) {
        Customer customer = new Customer(IntStream.range(0, want.length)
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(want[i], number[i]))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));


        return customer.calculateSignUpDates(Arrays.stream(discount).collect(Collectors.toList()), 10);
    }

    private static class Customer {
        private final Map<String, Integer> want;

        public Customer(Map<String, Integer> want) {
            this.want = want;
        }

        public int calculateSignUpDates(List<String> products, int timeWindow) {
            if (products.size() <= timeWindow) {
                return canSignUp(products) ? 1 : 0;
            }

            return (int) IntStream.rangeClosed(0, products.size() - timeWindow)
                    .filter(i -> canSignUp(products.subList(i, i + timeWindow)))
                    .count();
        }

        private boolean canSignUp(List<String> products) {
            return products.stream()
                    .collect(Collectors.collectingAndThen(
                            Collectors.groupingBy(Function.identity(), Collectors.counting()),
                            groupedProducts -> want.entrySet().stream()
                                    .allMatch(entry ->
                                            groupedProducts.getOrDefault(entry.getKey(), 0L) >= entry.getValue())));
        }
    } */

}
