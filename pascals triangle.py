n = int(input('No. of rows: '))
for i in range(1, n+1):
	for j in range(0, n-i+1):
		print(' ', end='')
	C = 1								# first element is always 1
	for j in range(1, i+1):				
		print(' ', C, sep='', end='')	# first value in a line is always 1
		C = C * (i - j) // j			# using Binomial Coefficient
	print()