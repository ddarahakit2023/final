import { shallowMount } from '@vue/test-utils'
import HeaderComponent from '@/components/HeaderComponent.vue'
import { setActivePinia, createPinia } from 'pinia'

describe('HeaderComponent.vue', () => {
  beforeEach(() => {
    // creates a fresh pinia and makes it active
    // so it's automatically picked up by any useStore() call
    // without having to pass it to it: `useStore(pinia)`
    setActivePinia(createPinia())
  })


  it('renders props.msg when passed', () => {
    const msg = 'new message'
    const wrapper = shallowMount(HeaderComponent, {
      props: { msg }
    })
    expect(wrapper.text()).toMatch(msg)
  })
})
