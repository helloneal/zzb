package zzb.rest

import shapeless._

abstract class ApplyConverterInstances {
  implicit def hac1[T1] = new ApplyConverter[T1 :: HNil] {
    type In = (T1) ⇒ Route
    def apply(fn: In) = {
      case t1 :: HNil ⇒ fn(t1)
    }
  }

  implicit def hac2[T1, T2] = new ApplyConverter[T1 :: T2 :: HNil] {
    type In = (T1, T2) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: HNil ⇒ fn(t1, t2)
    }
  }

  implicit def hac3[T1, T2, T3] = new ApplyConverter[T1 :: T2 :: T3 :: HNil] {
    type In = (T1, T2, T3) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: HNil ⇒ fn(t1, t2, t3)
    }
  }

  implicit def hac4[T1, T2, T3, T4] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: HNil] {
    type In = (T1, T2, T3, T4) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: HNil ⇒ fn(t1, t2, t3, t4)
    }
  }

  implicit def hac5[T1, T2, T3, T4, T5] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: HNil] {
    type In = (T1, T2, T3, T4, T5) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: HNil ⇒ fn(t1, t2, t3, t4, t5)
    }
  }

  implicit def hac6[T1, T2, T3, T4, T5, T6] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6)
    }
  }

  implicit def hac7[T1, T2, T3, T4, T5, T6, T7] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7)
    }
  }

  implicit def hac8[T1, T2, T3, T4, T5, T6, T7, T8] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8)
    }
  }

  implicit def hac9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9)
    }
  }

  implicit def hac10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)
    }
  }

  implicit def hac11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11)
    }
  }

  implicit def hac12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12)
    }
  }

  implicit def hac13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: T13 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)
    }
  }

  implicit def hac14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: T13 :: T14 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)
    }
  }

  implicit def hac15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: T13 :: T14 :: T15 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)
    }
  }

  implicit def hac16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: T13 :: T14 :: T15 :: T16 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16)
    }
  }

  implicit def hac17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: T13 :: T14 :: T15 :: T16 :: T17 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17)
    }
  }

  implicit def hac18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: T13 :: T14 :: T15 :: T16 :: T17 :: T18 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: t18 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18)
    }
  }

  implicit def hac19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: T13 :: T14 :: T15 :: T16 :: T17 :: T18 :: T19 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: t18 :: t19 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19)
    }
  }

  implicit def hac20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: T13 :: T14 :: T15 :: T16 :: T17 :: T18 :: T19 :: T20 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: t18 :: t19 :: t20 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20)
    }
  }

  implicit def hac21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: T13 :: T14 :: T15 :: T16 :: T17 :: T18 :: T19 :: T20 :: T21 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: t18 :: t19 :: t20 :: t21 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21)
    }
  }

  implicit def hac22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = new ApplyConverter[T1 :: T2 :: T3 :: T4 :: T5 :: T6 :: T7 :: T8 :: T9 :: T10 :: T11 :: T12 :: T13 :: T14 :: T15 :: T16 :: T17 :: T18 :: T19 :: T20 :: T21 :: T22 :: HNil] {
    type In = (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) ⇒ Route
    def apply(fn: In) = {
      case t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: t18 :: t19 :: t20 :: t21 :: t22 :: HNil ⇒ fn(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22)
    }
  }
}