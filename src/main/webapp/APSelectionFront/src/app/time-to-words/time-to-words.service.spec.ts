import { TestBed } from '@angular/core/testing';

import { TimeToWordsService } from './time-to-words.service';

describe('TimeToWordsService', () => {
  let service: TimeToWordsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TimeToWordsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
