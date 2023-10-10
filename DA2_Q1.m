syms y
f(y) = y^2+1;
x = 3;
I = solve(f-x);
a = I(1);
b = I(2);
Volume = pi*int((3-f)^2,b,a);
disp("Volume of the solid: ")
disp(Volume)

y = linspace(-3, 3, 100); 
x1 = y.^2 + 1;
x2 = 3 * ones(size(y));
figure;
plot(y, x1, 'b', 'LineWidth', 2);
hold on;
plot(y, x2, 'r', 'LineWidth', 2);
xlabel('y');
ylabel('x');
title('Graph of x = y^2 + 1 and x = 3');
legend('x = y^2 + 1', 'x = 3');
grid on;
hold off;