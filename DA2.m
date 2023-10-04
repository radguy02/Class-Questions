clear
clc
syms t real
C(t) = 8*(exp(-0.4*t)-(exp(-0.6*t)));
I = [0,12];
a = I(1);
b = I(2);
c1 = diff(C,t);
c2 = diff(C,t,2);
roots = double(solve(c1));
n = numel(roots);

for i = 1:n
    disp("At the critical points c: ");
    cp = roots(i);
    disp(cp);
    y = subs(c1,t,cp);
    yd = double(subs(c2,t,cp));
    yv = double(subs(C,t,cp));
    ca = subs(C,t,a);
    cb = double(subs(C,t,b));
    disp('At the interval points: ')
    disp(['At 0 = ', char(ca)]);
    disp('At 12 = ');
    disp(cb);
    if(yd>0)
        disp('Function has the local minima at c')
        disp("Local minima is: ")
        disp(yv)
    elseif(yd<0)
        disp("Function has the local maxima at c")
        disp("Local maxima is: ")
        disp(yv)
    else
        disp("Function has a inflectiopn point at c")
    end
end