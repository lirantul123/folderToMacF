#include <iostream>
#include "Holder.h"

template<typename T>
void changing(T& fe, T& se); // Function prototype

template<typename T>
T selfFun(T value1, T value2); // Function prototype

struct Structre
{
    int x = 99;
};

class FirstClass
{
private:
    int y, z;
public:
    FirstClass(int y, int z)
    {
        this->y = y;
        this->z = z;
    }

    int getY()
    {
        return y;
    }

    int getZ()
    {
        return z;
    }

    void setY(int y)
    {
        this->y = y;
    }

    void setZ(int z)
    {
        this->z = z;
    }
};

int fi = 1, se = 5;

int main()
{
    int a = 6, b = 6;
    int* ptr = &a;
    printf("The location of a-6 is at %p\n", ptr);
    int* ptr2 = &b;
    printf("The location of b-6 is at %p\n\n", ptr2);

    std::cout << 1 << ", " << 5 << "\n";
    changing(fi, se);
    std::cout << fi << ", " << se << "\n";

    Structre structre;
    structre.x = 11;
    std::cout << structre.x << "\n";

    FirstClass fc(20, 30);
    fc.setY(25);
    std::cout << "z- " << fc.getY() << "\n";
    std::cout << "z- " << fc.getZ() << "\n";
    std::cout << selfFun(std::string("he"), std::string("llo")) << "\n";

    return 0;
}

template<typename T>
void changing(T& fe, T& se)
{
    T tem = fe;
    fe = se;
    se = tem;
}

template<typename T>
T selfFun(T value1, T value2)
{
    return value1 + value2;
}
