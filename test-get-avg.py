from numpy import mean
arr1 = [['98.495', '96.4', '91.379', '100.471'], ['93.2', '92.42', '92.3729', '101.2'], ['93.2', '92.42', '92.3729', '101.2']]
arr_each_avg_time = []
avg_result = 0

for i in range(len(arr1)):
    each_avg_time = 0
    float_list = [float(index_list) for index_list in arr1[i]]
    print(float_list)
    each_avg_time = mean(float_list)
    arr_each_avg_time.append(each_avg_time)

print(arr_each_avg_time)
print("Total mean: ", round(mean(arr_each_avg_time), 4))

# number_list = [45.324, 34.123, 10.34, 36, 12, 6, 80.333]
# avg = mean(number_list)
# print("The average is ", round(avg,2))