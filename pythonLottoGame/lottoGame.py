# 함수 vs 메서드
# 내장함수 vs 사용자 정의 함수

# 개발자들이 만들어놓은 유용한 다양한 함수들이 있다.
# 함수들의 묶음이 생기기 시작
# 함수 묶음 == 모듈, 라이브러리
# 모듈(모듈안의 함수)을 사용하기 위해서는 import(다운로드, 설치, install)

#파이썬은 기능이 많다는게 장점이기 때문에 모듈, 라이브러리가 중요하다.



##from 모듈명 import 함수명1,함수명2,함수명3
##from 모듈명 import 함수명 as 함수별칭
##별도의 설치없이 import를 할수 있는 애들을 "표준 모듈" 이라 부른다.

## random.sample 첫번째 인자 범위내에서 두번째 인자 숫자만큼 데이터를 뽑아주세요

## ★LOTTO GAME 설계서★
## 로또 게임은 4가지의 메뉴가 있습니다!
## 1. 로또 구매하기 (로또번호는 1~15) 
## 2. 로또 정답확인 및 전체 당첨 확률 출력
## 3. 수령한 로또 금액 확인 
## 4. 종료
## 사용자는 기본 자본금이 주어집니다! 10000원 
## 사용자는 로또를 구매할수 있는 개수를 선택한 후 구매합니다.  (1~3) 1개에 500원~
## 이번회차의 로또 정답과 구매한 로또의 정답을 확인해 당첨된 금액을 수령합니다!
## 사용자는 로또를 구매할때마다 새로운 로또번호가 생성되며 3번을 누르면
## 누적수령한 로또 수령금액을 확인할 수 있습니다.


## 한글코딩★
## 로또게임 START !
## 로또게임 메뉴출력
## 1번선택시
## 몇개를 구매하시겠습니까 ?! ( 1~5 )
## 구매개수 선택 ex 3
## 첫번쨰 로또 번호를 3개 입력해주세요 !
## 로또 번호 입력 (1, 4, 11)
## 첫번쨰 로또 번호를 3개 입력해주세요 !
## 로또 번호 입력 (1, 2, 12)
## 첫번쨰 로또 번호를 3개 입력해주세요 !
## 로또 번호 입력 (1, 5, 9)
## 메뉴로 돌아감
## 2번 선택시
## ☆축하드립니다~  2등 당첨! 수령금은 5만원 입니다~! or 꽝 출력 및
## 전체 당첨 확률 출력
## 메뉴출력
## 3번 선택시
## 현재 자본은 40000원 입니다!
## 4번 선택시
## 종료

import random as r
import time as t
import matplotlib.pyplot as plt

def lottoGame():
    art = [
        "   .'`'.'`'.       88              ,d      ,d",
        ".''.`.  :  .`.''.  88              88      88",
        "'.    '. .'    .'  88  ,adPPYba, MM88MMM MM88MMM ,adPPYba,",
        ".```  .' '.  ```.  88 a8\"     \"8a  88      88   a8\"     \"8a",
        "'..',`  :  `,'..'  88 8b       d8  88      88   8b       d8 ",
        "   `-'`'-`))       88 \"8a,   ,a8\"  88,     88,  \"8a,   ,a8\"",
        "          ((       88  `\"YbbdP\"'   \"Y888   \"Y888 `\"YbbdP\"'",
        "           ))",          
        "           ||"               
    ]

    for line in art:
        print(line)

  
    lottoBuyList = [[]]
    lottoBuyTime = []
    lottoWinHistory = []
    lottoNumber = []
    lottoNumber.append(r.sample(range(1, 15), 3))
    defaultMoney = 5000
    matchCnt = []
    lottoBuyCnt = 0
    thisRoundTotalLottoBuyCnt = 0
    winNum = 0
    moneyChangedY =[5000]
    moneyChangedX =[0]
    winChkFlag=False
    lottoRound =1
     
    while True:
        print("┌───────── LoTTo Game ─────────┐")
        print("│                                                │")
        print("│       경    고:  도박은 좋지 않습니다...       │")
        print("│                                                │")
        print("│       1. 구매하기                              │")
        print("│       2. 당첨 및 자산 변화 그래프 확인         │")
        print("│       3. 확률 확인                             │")
        print("│       4. 종료                                  │")
        print("└────────────────────────┘\n")
        select = int(input("번호를  입력하세요 >> "))
        
        if select == 4:
            print("\n게임을 종료합니다... ")
            break
        
        elif select == 1:
            if winChkFlag:
                lottoRound += 1
                lottoBuyCnt = 0
                thisRoundTotalLottoBuyCnt = 0
            print("◆ " + str(lottoRound) + "회차 로또 ◆")
            print("현재자산 : " + str(defaultMoney) + " 원")
            print("1개 가격 : 1000 원")
            lottoBuyCnt = int(input("몇개를 구매하시겠습니까? >>"))
            if defaultMoney - 1000 * lottoBuyCnt < 0:
                print("돈이 부족합니다")
            else:
                if winChkFlag:
                    lottoNumber.append(r.sample(range(1, 15), 3))
                    print(lottoNumber) 
                    matchCnt = []
                lottoWinHistory.append([])
                lottoBuyTime.append([])
                lottoBuyList.append([])
                for i in range(lottoBuyCnt):
                    lottoBuyList[lottoRound-1].append([])
                    matchCnt.append(0)
                print("[로그] lottoBuyList :" + str(lottoBuyList))
                

                
                print("[로그] lottoNumber :" + str(lottoNumber))
                defaultMoney -= 1000 * lottoBuyCnt
               
                
                
              
                print("[로그] moneyChangedX :" + str(moneyChangedX))
                    
                for i in range(lottoBuyCnt):
                    print(str(i+1) + "번째 로또 번호를 입력해주세요")
                    for j in range(3):
                        while True:
                            inputNum = int(input()) 
                            if inputNum in lottoBuyList[lottoRound-1][i+thisRoundTotalLottoBuyCnt]:
                                print("중복된 번호! 다시 입력하세요")
                            else:
                                lottoBuyList[lottoRound-1][i+thisRoundTotalLottoBuyCnt].append(inputNum)
                                print(lottoBuyList[lottoRound-1][i+thisRoundTotalLottoBuyCnt])
                                break
                    lottoBuyTime[lottoRound-1].append(t)
                print("[로그] lottoBuyList :" + str(lottoBuyList))
                thisRoundTotalLottoBuyCnt += lottoBuyCnt
                winChkFlag=False

        elif select == 2:
            if len(lottoBuyList[lottoRound-1]) == 0:
                print("구매한 로또가 없습니다...")
                continue
            else:
                print("matchCnt:"+str(matchCnt))
                print("♣ " + str(lottoRound) +"회차 로또 번호 ♣")
                print(lottoNumber[lottoRound-1])
                print()
                print("♧ 구매한 로또 번호 ♧")
                for i in range(thisRoundTotalLottoBuyCnt):
                      print(lottoBuyList[lottoRound-1][i])

                if not winChkFlag:
                    for i in range(len(lottoNumber[lottoRound-1])):
                        for j in range(thisRoundTotalLottoBuyCnt):
                            for k in range(len(lottoNumber[lottoRound-1])):
                                if lottoBuyList[lottoRound-1][j][k] == lottoNumber[lottoRound-1][i]:
                                    matchCnt[j] += 1
                                    break
                print(matchCnt)
                            
                for i in range(thisRoundTotalLottoBuyCnt):
                    if matchCnt[i] == 1 :
                        print("축하축하 3등당첨...!")
                        if not winChkFlag:
                            defaultMoney += 10000
                            winNum += 1
                            lottoWinHistory[lottoRound-1].append("3등")
                    elif matchCnt[i] == 2 :
                        print("축하합니다!!!!!!!!!! 2등당첨")
                        if not winChkFlag:
                            defaultMoney += 500000
                            winNum += 1
                            lottoWinHistory[lottoRound-1].append("2등")

                    elif matchCnt[i] == 3 :
                        print("★☆★☆대박☆★☆★ 1등당첨")
                        if not winChkFlag:
                            defaultMoney += 100000000
                            winNum += 1
                            lottoWinHistory[lottoRound-1].append("1등")
                    else:
                        print("꽝")
                        lottoWinHistory[lottoRound-1].append("꽝")
                        
                if not winChkFlag:
                    moneyChangedX.append(lottoRound)
                    moneyChangedY.append(defaultMoney)
                winChkFlag=True     
   

                    

                    
                    
                print("[로그] moneyChangedY :" + str(moneyChangedY))
                print("현재까지의 자산 변화 그래프")
                plt.plot(moneyChangedX,moneyChangedY)
                plt.show()


                print(lottoBuyTime[0][2].strftime('%Y-%m-%d %H:%M:%S'))
                print(lottoBuyList[0][2])
                print(lottoWinHistory[0][2])
                
                print(lottoBuyTime)
                print(lottoBuyList)
                print(lottoWinHistory)
                
                
        elif select == 3:
            for a in range(lottoRound):
                print("---------------"+str(a+1)+"회차-----------")
                print("당첨 번호 >>" + str(lottoNumber[a]))
                print("구매시간  |   구매번호    |      당첨확인")
                for i in range(len(lottoBuyList[a])):
                    print(str(lottoBuyTime[a][i].strftime('%Y-%m-%d %H:%M:%S')) + "   " + str(lottoBuyList[a][i]) + "    " + str(lottoWinHistory[a][i]))
                   
                            
                        
                    
                    
                
                        
                            
                    

                    
                                
