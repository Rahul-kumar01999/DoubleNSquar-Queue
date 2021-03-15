// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus
// scalastyle:off magic.number
import org.scalatest.flatspec.AnyFlatSpec

class Double_SquareQueueTest extends AnyFlatSpec {
 val doubleQueue= new Double_SquareQueue

  "enQueue in doubleQueue " should "first double the element then add it to the queueList " in {
    assert(doubleQueue.enQueue(List(1, 2, 3), input = List(3,4)) == List(1, 2, 3,6,8))
  }

  "enQueue in doubleQueue" should "return the enQueued element" in {
    assert(doubleQueue.enQueue(List(), input = List(1,2,3)) == List(2,4,6))
  }

  it should "throw NoSuchElementException if List is empty" in
    assertThrows[NoSuchElementException] {
      doubleQueue.deQueue(List())
    }

  "deQueue in doubleQueue " should "remove the front element from the queueList " in {
    assert(doubleQueue.deQueue(List(1, 2, 3, 4)) == List(2, 3, 4))
  }



  val squareQueue = new Square_Queue

  "enQueue in squareQueue " should "return the square of the element to queueList " in {
    assert(squareQueue.enQueue(List(1, 2, 3), input = List(4)) == List(1, 2, 3, 16))
  }

  "enQueue in squareQueue" should "return the square of the enQueued element to queueList" in {
    assert(squareQueue.enQueue(List(), input = List(1,2,3)) == List(1,4,9))
  }

  it should "throw NoSuchElementException if List is empty" in
    assertThrows[NoSuchElementException] {
      squareQueue.deQueue(List())
    }


  "dequeue in squareQueue " should "remove the front element from the queueList " in {
    assert(squareQueue.deQueue(List(1, 2, 3, 4)) == List(2, 3, 4))
  }

}
