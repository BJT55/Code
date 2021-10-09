# s ='Hello, %s' % 'world'
# print(s)

# s = 'Hi, %s, you have $%d.' % ('Michael', 1000000)
# print(s)

# s = 'growth rate: %d%%' % 7
# print(s)

# s = 'hello, {0}, 恭喜你成绩提高了 {1}%'.format('晓红',12.31)
# print(s)

# r = 2.5
# s = 3.14*r**2
# print(f'radius {r} is {s:.2f}')

# s1 = 72
# s2 = 85
# r = (85-72)/72
# print(f'{r:.1f}%')

# classmates = ['Michael', 'Bob', 'Tracy']
# k=len(classmates)
# print(k)
# print(classmates)
# print(classmates[0])
# print(classmates[3])
# print(classmates[-1])
# print(classmates[-2])
# classmates.append('Lily')
# classmates.insert(1,'Amy')
# classmates.pop(0)
# classmates[1] = 'Susan'
# print(classmates)

# # [] 可以修改元素, () 不可以修改元素内容
# l = ['apple',[12,14,'banana'],True]
# # list中的元素数据类型也可以是不同的
# print(len(l))

# t = (1,2)
# # print(t[0])
# t.append(4) # 错误语法
# print(t)

# L = [
#     ['Apple', 'Google', 'Microsoft'],
#     ['Java', 'Python', 'Ruby', 'PHP'],
#     ['Adam', 'Bart', 'Lisa']
# ]
# # 打印Apple:
# print(L[0][0])
# # 打印Python:
# print(L[1][1])
# # 打印Lisa:
# print(L[2][2])


# 判断
# age = 20
# if age >= 18:
#     print('your age is', age)
#     print('adult')  # if如果是True, 则执行缩进的两行print语句
# else :
#     print('your age is %d',age)
#     print('child')

# age = 3
# if age >= 18:
#     print('adult')
# elif age >= 6:
#     print('teenager')
# else:
#     print('kid')


# s = input('birth is :')
# birth = int(s)
# if birth >= 2010:
#     print('10后')
# elif birth >= 2000:
#     print('00后')
# else:
#     print('其他')

# height = 1.75
# weight = 80.5
# bmi = weight/(height**2)
# if bmi < 18.5:
#     print('过轻')
# elif 18.5 <= bmi < 25:
#     print('正常')
# elif 25 <= bmi < 28:
#     print('过重')
# elif 28 <= bmi < 32:
#     print('肥胖')
# else :
#     print('严重肥胖')
   

# 循环
# names = ['Michael', 'Bob', 'Tracy']
# for name in names:
#     print(name)

# sum = 0
# for x in [1,2,3,4,5,6,7,8,9]:
#     sum += x
# print(sum)

# sum = 0
# for x in range(101):
#     sum = sum + x
# print(sum)

# t = list(range(5))
# print(t)

# L = ['Bart', 'Lisa', 'Adam']
# for x in L:
#     # s = 'hello, %s!' % x
#     # print(s)
#     print('Hello, %s!' %x)


# n = 1
# while n <= 100:
#     print(n)
#     n = n + 1
# print('END')

# n = 1
# while n <= 100:
#     if n > 10:
#         break
#     print(n)
#     n += 1
# print('END')

# n = 0
# while n < 10:
#     n = n + 1
#     if n % 2 == 0: 
#         continue
#     print(n)

# d = {'Michael': 95, 'Bob': 75, 'Tracy': 85}
# print(d['Michael'])
# d['Lily'] = 31
# print(d['Lily'])
# d['Amy']
# print(d['Amy'])
# print(d.get('Susan'),-1)
# d.pop('Bob')
# print(d['Bob'])

# s = set([1, 2, 3])
# s = set([1, 2, 1, 3, 4, 4, 2])
# s.add(5)
# s.remove(5)
# print(s)

# s1 = set([1, 2, 3])
# s2 = set([2, 3, 4])
# print(s1 & s2)
# print(s1 | s2)

# a = ['c', 'b', 'a']
# a.sort()
# print(a)
# b = [9,12,98,54,71]
# b.sort()
# print(b)

a = 'abc'
b = a.replace('a','A')
print(a)
print(b)