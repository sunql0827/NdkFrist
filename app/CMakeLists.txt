

cmake_minimum_required(VERSION 3.4.1)

add_library(demo-lib
             SHARED
             src/main/cpp/demo-lib.cpp )
add_library(test-demo
             SHARED
             src/main/cpp/test-demo.cpp )

find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

target_link_libraries(demo-lib
                       ${log-lib} )
target_link_libraries(test-demo
                       ${log-lib} )