import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeToWordsComponent } from './time-to-words.component';

describe('TimeToWordsComponent', () => {
  let component: TimeToWordsComponent;
  let fixture: ComponentFixture<TimeToWordsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TimeToWordsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TimeToWordsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
