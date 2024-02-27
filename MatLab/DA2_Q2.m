syms x y real
f(x,y) = input("Enter the fucntion: ");
fx = diff(f,x);
fy = diff(f,y);
[a,b] = solve(fx,fy);
a = double(a);
b = double(b);
fxx = diff(fx,x);
fyy = diff(fy,y);
fxy = diff(fy,x);
figure
fsurf(f);
legstr = ('Function Plot');
for i = 1: size(a)
    d = fxx*fyy - fxy^2;
    T = d(a(i), b(i));
    U = fxx(a(i), b(i));
    V = f(a(i), b(i));
    if (double(T)==0)
        sprintf('At point (%f,%f) furthur investigation is required.', a(i),b(i))
        legstr = [legstr,{'Case of furthur investigation.'}];
        mkr = 'ko';
    elseif (double(T)<0)
        sprintf('The point (%f,%f) is a saddle.', a(i),b(i))
        legstr = [legstr,{'Saddle Point'}];
        mkr = 'bv';
    else
        if (double(U)<0)
            sprintf('The maximum value of the function is f(%f,%f) = %f', a(i),b(i),V)
            legstr = [legstr,{'Maximum Value'}];
            mkr = 'g+';
        else
            sprintf('The minimum value of the function is f(%f,%f) = %f', a(i),b(i),V)
            legstr = [legstr,{'Mimimum Value'}];
            mkr = 'r+';
        end
    end
    hold on
    plot3(a(i),b(i),V, mkr, 'Linewidth', 4);
end
legend(legstr,'Location','best');
