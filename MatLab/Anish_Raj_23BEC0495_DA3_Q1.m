clear
clc
syms x y L
f = x^2*y^2;
g = 2*x+4*y-40;
l = f+L*g;
fx = diff(l,x);
fy = diff(l,y);
fL = diff(l,L);
s = solve(g, fx, fy, 'Real', true);
stat_point = [s.x, s.y]
f_value = subs(f, {x, y}, {s.x, s.y})
fprintf('Maximum value of the fucntion is %f\n', f_value(3));